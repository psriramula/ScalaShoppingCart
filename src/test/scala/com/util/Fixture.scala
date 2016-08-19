package com.util

import com.shoppingcart.model.{Orange, Apple, CheckOutSystem, CatalogueItem}

/**
 * Created by prasadsriramula on 19/08/2016.
 */


object Fixture {

  val shoppingCartWithNoItems = new CheckOutSystem( List.empty[CatalogueItem])

  val shoppingWithTwoApples = new CheckOutSystem(List(Apple,Apple))

  val shoppingWithTwoApplesWithOffer = new CheckOutSystem(List(Apple,Apple))

  val shoppingWithThreeOranges = new CheckOutSystem(List(Orange,Orange,Orange))





}
