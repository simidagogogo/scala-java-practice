set -e -x

HADOOP_CMD="/usr/local/src/hadoop-2.6.5/bin/hadoop"
STREAM_JAR_PATH="/usr/local/src/hadoop-2.6.5/share/hadoop/tools/lib/hadoop-streaming-2.6.5.jar"

INPUT_FILE_PATH_A="/a.txt"
INPUT_FILE_PATH_B="/b.txt"

OUTPUT_SORT_PATH="/output_sort"

#$HADOOP_CMD fs -rmr -skipTrash $OUTPUT_SORT_PATH

# Step 3.
$HADOOP_CMD jar $STREAM_JAR_PATH \
    -input $INPUT_FILE_PATH_A,$INPUT_FILE_PATH_B\
    -output $OUTPUT_SORT_PATH \
    -mapper "python map_sort.py" \
    -reducer "python red_sort.py" \
    -jobconf "mapred.reduce.tasks=1" \
    -file ./map_sort.py \
    -file ./red_sort.py \
