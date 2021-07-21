FROM java:openjdk-8-jre-alpine
MAINTAINER programmer_qn programmer_qn@163.com
VOLUME /tmp
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD target/eureka-server.jar /app.jar
#ENV JAVA_OPTS "-server -Xmx512m -Xms512m -Xmn128m -Xss256k \
#-XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:InitialSurvivorRatio=8 \
#-XX:+DisableExplicitGC -XX:+UseConcMarkSweepGC \
#-XX:+CMSParallelRemarkEnabled -XX:+UseFastAccessorMethods \
#-XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/ -Xloggc:/tmp/gc-%t.log\
#-XX:+PrintGC -XX:+PrintHeapAtGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC"
ENV JAVA_OPTS "-server"
EXPOSE 8761
ENTRYPOINT java "$JAVA_OPTS" "-Djava.security.egd=file:/dev/./urandom" "-Duser.timezone=GMT+08" "-jar" "/app.jar"