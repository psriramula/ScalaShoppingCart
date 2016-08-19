package com.shoppingcart.model

/**
 * Created by prasadsriramula on 19/08/2016.
 */
sealed trait CatalogueItem {
  def price: Double
}

object Apple extends CatalogueItem {
  override def price: Double = 0.60
}

object Orange extends CatalogueItem {
  override def price: Double = 0.25
}


class  ShoppingCart(val items: List[CatalogueItem])

object ShoppingCart{

  def amount(shoppingCart: ShoppingCart) = shoppingCart.items.foldLeft(0.0)((acc, item) => acc + item.price)

}
