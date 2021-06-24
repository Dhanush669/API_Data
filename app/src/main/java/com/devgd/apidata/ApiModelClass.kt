package com.devgd.apidata

class ApiModelClass(exchange_id: String?, symbol: String?, price_uncon: String?,price: String?,change: String?,
                    spread: String?,volume: String?,status: String?,time: String?) {
    private var exchange_id: String
    private  var symbol: String
    private  var price_uncon: String
    private  var price: String
    private  var change: String
    private  var spread: String
    private  var volume: String
    private  var status: String
    private  var time: String
    init {
        this.exchange_id = exchange_id!!
        this.symbol=symbol!!
        this.price_uncon=price_uncon!!
        this.price=price!!
        this.change=change!!
        this.spread=spread!!
        this.volume=volume!!
        this.status=status!!
        this.time=time!!
    }
    fun getExcId(): String? {
        return exchange_id
    }
    fun setExcId(exchange_id: String?) {
        this.exchange_id = exchange_id!!
    }

    fun getSymbol(): String? {
        return symbol
    }
    fun setSymbol(symbol: String?) {
        this.symbol = symbol!!
    }

    fun getPriceUnc(): String? {
        return price_uncon
    }
    fun setPriceUnc(price_uncon: String?) {
        this.price_uncon = price_uncon!!
    }

    fun getPrice(): String? {
        return price
    }
    fun setPrice(price: String?) {
        this.price = price!!
    }

    fun getChange(): String? {
        return change
    }
    fun setChange(change: String?) {
        this.change = change!!
    }

    fun getSpread(): String? {
        return spread
    }
    fun setSpread(spread: String?) {
        this.spread = spread!!
    }

    fun getVolume(): String? {
        return volume
    }
    fun setVolume(volume: String?) {
        this.volume = volume!!
    }

    fun getStatus(): String? {
        return status
    }
    fun setStatus(status: String?) {
        this.status = status!!
    }

    fun getTime(): String? {
        return time
    }
    fun setTime(time: String?) {
        this.time = time!!
    }
}