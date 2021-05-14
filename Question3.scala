object Question3{
  def Cost(books:Int): Double ={
    var cost = 0.0
    cost = books * 24.95 * 0.6
    if(books>50){
      cost = cost + ((books-50) * 0.75) + (50 * 3)
    }
    else{
      cost += books * 3
    }
    return cost
  }
}
