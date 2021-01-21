# JavaManipulation

### Java Code 의 조작

코드 커버리지 측정방법

JaCoCo 이용


* Pom.xml 플러그인 추가
~~~
<plugin>
<groupId>org.jacoco</groupId>
<artifactId>jacoco-maven-plugin</artifactId>
<version>0.8.4</version>
<executions>
<execution>
<goals>
<goal>prepare-agent</goal>
</goals>
</execution>
<execution>
<id>report</id>
<phase>prepare-package</phase>
<goals>
<goal>report</goal>
</goals>
</execution>
</executions>
</plugin>
~~~


% 이 제한 조건
~~~
<execution>
<id>jacoco-check</id>
<goals>
<goal>check</goal>
</goals>
<configuration>
<rules>
<rule>
<element>PACKAGE</element>
<limits>
<limit>
<counter>LINE</counter>
<value>COVEREDRATIO</value>
<minimum>0.50</minimum>
</limit>
</limits>
</rule>
</rules>
</configuration>
</execution>
~~~

