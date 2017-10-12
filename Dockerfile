FROM java:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ./gradlew build
CMD ["./gradlew", "run"]