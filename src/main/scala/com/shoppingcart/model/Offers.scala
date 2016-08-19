package com.shoppingcart.model

/**
 * Created by prasadsriramula on 19/08/2016.
 */


object Offers {

  type Offer = CheckOutSystem => Double

  val applesOffer: Offer = (checkOutSystem) => {
    val apples = checkOutSystem.items.collect{case a @ Apple => a}.size
    (apples / 2 * Apple.price)
  }



}