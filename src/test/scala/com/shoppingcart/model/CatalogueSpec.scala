package com.shoppingcart.model

import com.util.{Fixture, UnitSpec}

/**
 * Created by prasadsriramula on 19/08/2016.
 */

class CatalogueSpec extends UnitSpec {


  s"a unit Apple price " should s"be 0.60" in {
    val result = Apple.price
    result should be(0.60)
  }


  s"a unit Orange price " should s"be 0.25" in {
    val result = Orange.price
    result should be(0.25)
  }

  s"Shopping Cart with no items amount" should s"be 0.00" in {
    val result = CheckOutSystem.amount(Fixture.shoppingCartWithNoItems )()
    result should be(0.0)
  }


}
