# git clone https://github.com/bingpple/dockerfiles.git
# cd dockerfiles/serenity_base
FROM openjdk:8

RUN apt-get update \
    && apt-get install -qy \
    maven \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /usr/share/maven

ENV PATH /usr/share/maven/bin:$PATH

COPY pom.xml .

RUN mvn serenity:aggregate install clean 
