java -jar lib/java-cup-11b.jar -locations -interface -parser Parser   Parser.cup
javac -cp java-cup-11b-runtime.jar *.java
java  -cp java-cup-11b-runtime.jar -cp . main test/Prueba.txt