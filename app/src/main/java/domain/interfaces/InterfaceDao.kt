package domain.interfaces

import domain.models.Hotel

interface InterfaceDao {
    fun getDataHotels(): List<Hotel>
  // fun getHotel(a:Int) : Hotel
  //  fun addHotel(hotel : Hotel) : Boolean

}