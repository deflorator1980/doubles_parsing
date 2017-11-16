Имеется массив из 1 млн вещественных чисел, расположенных по возрастанию.
Целая часть одного из них равна номеру индекса на котором оно находится.
Нужно найти его.
Написать тесты к предлагаемому решению.

В тестовом массиве на всякий случай два таких числа -- оба находятся

mvn  package && java -jar target/doubles_parsing-1.0-SNAPSHOT-jar-with-dependencies.jar

sbt package && $SPARK_HOME/bin/spark-submit --class "Search" target/scala-2.11/doubles-parsing_2.11-1.0.jar



