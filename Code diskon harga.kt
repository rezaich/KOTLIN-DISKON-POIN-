fun main() {
    var x = 300
    var y = 50000
    var diskon =0
    var member=""
    val myCurrency = NumberFormat
        .getCurrencyInstance(Locale("in", "ID"))

    println("harga pembelian: ${myCurrency.format(y)}")
    println("poin : $x")

    if(x <= 100 && x>= 0){
        member = "member biasa"
    } else if(x >= 101 && x <=300){
        member = "silver"
    } else if(x >= 301 && x <= 500){
        member = "gold"
    }else if(x >= 501 && x<= 1000) {
        member = "platinum"
    }
    when(member){
        "silver" -> diskon = 5
        "gold" -> diskon = 15
        "platinum" -> diskon= 30
        else -> diskon= 0
    }
    println("harga setelah diskon : ${myCurrency
        .format(y-(y*diskon/100))}")
}
