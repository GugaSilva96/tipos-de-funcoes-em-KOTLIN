data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName(): String = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String 
	get() = items.map {it.name}.joinToString()
    
fun main() {
    val order = Order(listOf(Item("Açaí da Lorena", 29.0F), Item("Açaí da Guga", 25.0F), Item("Açaí da Nala", 15.0F)))
    
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item values: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}

