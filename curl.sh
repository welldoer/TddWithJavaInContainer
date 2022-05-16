curl https://start.spring.io/starter.tgz \
 -d type=gradle-project -d language=java \
 -d dependencies=data-jpa,h2 \
 -d groupId=net.blogjava.welldoer -d artifactId=demo \
  | tar -xzvf -
# platformVersion=2.6.7&packaging=jar&jvmVersion=11