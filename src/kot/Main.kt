package kot

fun main() {
  var workers = mutableListOf<Worker>()
  workers.add(Seller("Илья",23))
  workers.add(Seller("Иван",25))
  workers.add(Seller("Саша",26))
  workers.add(Programmer("Артем",28,"C#"))
  workers.add(Programmer("Федя",21,"Kotlin"))
  workers.add(Director("Осел",50,))
  for (worker in workers){
       worker.work()
    if (worker is Cleaner){
      worker.clean()
    }
  }
}




