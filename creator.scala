import scala.tools.nsc.io.File
for(i <- 30 until 10000000 by 10){File("real_num_s.txt").appendAll("\n" + i + ".34324")}

