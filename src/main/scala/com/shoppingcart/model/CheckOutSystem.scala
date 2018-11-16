package com.shoppingcart.model

import com.shoppingcart.model.Offers.Offer

/**
 * Created by prasadsriramula on 19/08/2016.
 */

class  CheckOutSystem(val items: List[CatalogueItem])

object CheckOutSystem{


  def amount(checkOutSystem: CheckOutSystem)(offers: List[Offer] = List.empty[Offer]) = {
    val totalPrice = checkOutSystem.items.foldLeft(0.0)((acc, item) => acc + item.price)
    if(offers.isEmpty) totalPrice
    else  "%015.2f".format(offers.foldLeft(totalPrice)((acc, offer) => acc - offer(checkOutSystem))).toDouble
  }

}
