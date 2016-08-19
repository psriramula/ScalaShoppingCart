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

  s"Shopping Cart with no items amount with no offers" should s"be 0.00" in {
    val result = CheckOutSystem.amount(Fixture.shoppingCartWithNoItems )()
    result should be(0.0)
  }

  s"Shopping Cart with two apples" should s"be 1.2 " in {
    val result = CheckOutSystem.amount(Fixture.shoppingWithTwoApples )()
    result should be(1.2 )
  }


  s"Shopping Cart with two apples with buy one, get one free on Apples" should s"be 0.6  " in {
    val result = CheckOutSystem.amount(Fixture.shoppingWithTwoApples )(Offers.applesOffer :: Nil)
    result should be(0.6 )
  }

  s"Shopping Cart with three Oranges" should s"be 0.75  " in {
    val result = CheckOutSystem.amount(Fixture.shoppingWithThreeOranges )()
    result should be(0.75 )
  }

  s"Shopping Cart with three Oranges with buy one, get one free on Apples" should s"be 0.75  " in {
    val result = CheckOutSystem.amount(Fixture.shoppingWithThreeOranges )(Offers.applesOffer :: Nil)
    result should be(0.75 )
  }

}
