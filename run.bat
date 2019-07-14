java -jar java-cup-11b.jar -locations -interface -parser Parser   Parser.cup
javac  -cp  java-cup-11b-runtime.jar  -cp . Compiler2.java Lexer.java main.java parser.java sym.java OutputWriter.java BinaryGenerator.java
java  -cp java-cup-11b-runtime.jar -cp .  main Prueba.txt