package com.shoppingcart.model

/**
 * Created by prasadsriramula on 19/08/2016.
 */
sealed trait CatalogueItem {
  def price: Double
}

object Apple extends CatalogueItem {
  override def price  = 0.60
}

object Orange extends CatalogueItem {
  override def price  = 0.25
}


