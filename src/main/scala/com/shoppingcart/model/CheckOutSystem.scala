package com.shoppingcart.model

/**
 * Created by prasadsriramula on 19/08/2016.
 */

class  CheckOutSystem(val items: List[CatalogueItem])

object CheckOutSystem{

  def amount(items: List[CatalogueItem]) = items.foldLeft(0.0)((acc, item) => acc + item.price)

}
