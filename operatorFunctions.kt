fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Não contavam com a minnha astúcia!                    ")
    
    operator fun String.get(range: IntRange) = substring(range)
    val str = "A vingança nunca é plena. Mata a alma e a envenena! A PARTIR DAQUI NÃO SAIRÁ NO PRINT !IHUL!"
    println(str[0..50])
}
