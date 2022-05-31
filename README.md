# Virtual Food Chain Model  
# Overview  
This program manages the income of the food chain as well as the employees' and employer's income. Depending on the sales, the income for the owner is calculated, the taxes needed to pay is calculated. This program heavily uses most concepts of object oriented programming.
# Classes
  - [`Check`](Check.java) Check models a customer’s payment. It is used to specify the menu price, sales tax, and tip.
  - [`Customer`](Customer.java) Properties/methods of a customer vising a food place.
  - [`FoodPlace`](FoodPlace.java) FoodPlace is an abstract class which has the general methods and properties of any type of restaurants.
  - [`FastFood`](FastFood.java) Properties/methods of a FastFood restaurant which extends [`FoodPlace`](FoodPlace.java).
  - [`FoodStand`](FoodStand.java) Properties/methods of a FoodStand which extends [`FoodPlace`](FoodPlace.java).
  - [`Restaurant`](Restaurant.java) Properties/methods of a basic restaurant which extends [`FoodPlace`](FoodPlace.java).
  - [`IncomeTaxPayer`](IncomeTaxPayer.java) Properties/methods of a tax payer.
  - [`Owner`](Owner.java) Properties/methods of an owner which extends [`IncomeTaxPayer`](IncomeTaxPayer.java).
  - [`Staff`](Staff.java) Properties/methods of a staff.
  - [`Sever`](Sever.java) Properties/methods of a server which extends [`Staff`](Staff.java).
  - [`WorkingOwner`](WorkingOwner.java) Properties/methods of a working owner which extends [`Owner`](Owner.java).
  - [`TaxCollector`](TaxCollector.java) Properties/methods of a tax collector
