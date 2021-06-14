
HADOOP_CMD="/usr/local/src/hadoop-2.6.5/bin/hadoop"
STREAM_JAR_PATH="/usr/local/src/hadoop-2.6.5/share/hadoop/tools/lib/hadoop-streaming-2.6.5.jar"

INPUT_FILE_PATH_1="/music_meta.txt.small"
OUTPUT_Z_PATH="/output_z_fenci"

$HADOOP_CMD fs -rmr $OUTPUT_Z_PATH
$HADOOP_CMD fs -rmr $OUTPUT_D_PATH

# Step 1.
$HADOOP_CMD jar $STREAM_JAR_PATH \
    -input $INPUT_FILE_PATH_1 \
    -output $OUTPUT_Z_PATH \
    -mapper "python map_seg.py" \
    -jobconf "mapred.reduce.tasks=0" \
    -jobconf "mapreduce.map.memory.mb=4096" \
    -jobconf  "mapred.job.name=jieba_fenci_demo" \
    -file "./jieba.tgz" \
    -file "./map_seg.py"

