object TenThousandNamePrinter extends App {
  for (i <- 1 to 1000000) {
    new Thread(() => {
      Thread.sleep(1000)
      println(Thread.currentThread().getName)
    }).start()
  }
}