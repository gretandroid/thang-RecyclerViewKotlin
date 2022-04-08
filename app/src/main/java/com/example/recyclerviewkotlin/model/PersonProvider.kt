package com.example.recyclerviewkotlin.model

class PersonProvider {
    companion object {
        fun getPersons() = listOf<Person>(
            Person("PHAM", "Thang"),
            Person("PHAM", "Alex"),
            Person("PHAM", "Louis"),
            Person("TRINH", "Mai")
        )
    }
}