set -e -x

HADOOP_CMD="/usr/local/src/hadoop-2.6.5/bin/hadoop"
STREAM_JAR_PATH="/usr/local/src/hadoop-2.6.5/share/hadoop/tools/lib/hadoop-streaming-2.6.5.jar"

INPUT_FILE_PATH_A="/a.txt"
INPUT_FILE_PATH_B="/b.txt"

OUTPUT_SORT_PATH="/output_sort"

$HADOOP_CMD fs -rmr -skipTrash $OUTPUT_SORT_PATH

# Step 3.
$HADOOP_CMD jar $STREAM_JAR_PATH \
    -input $INPUT_FILE_PATH_A,$INPUT_FILE_PATH_B\
    -output $OUTPUT_SORT_PATH \
    -mapper "python map_sort.py" \
    -reducer "python red_sort.py" \
    -file ./map_sort.py \
    -file ./red_sort.py \
    -partitioner org.apache.hadoop.mapred.lib.KeyFieldBasedPartitioner \
    -jobconf mapred.output.key.comparator.class=org.apache.hadoop.mapred.lib.KeyFieldBasedComparator \
    -jobconf stream.num.map.output.key.fields=1 \
    -jobconf mapred.text.key.partitioner.options="-k1,1" \
    -jobconf mapred.text.key.comparator.options="-k1,1n" \
    -jobconf mapred.reduce.tasks=1

