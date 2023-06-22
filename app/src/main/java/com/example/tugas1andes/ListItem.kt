package com.example.tugas1andes

object ListItem {//tes
    fun buatList (): MutableList<RecyclerViewItemModel> {
        val daftarItem = mutableListOf<RecyclerViewItemModel>()

        daftarItem.add(RecyclerViewItemModel(R.drawable.flower, "Flower", "Jisoo", "2023"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.moonlight, "Moonlight Sunrise", "TWICE", "2023"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.dittonewjeans, "Ditto", "NewJeans", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.girls, "Girls", "Aespa", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.antifragile, "Antifragile", "Le Sserafim", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.afterlike, "After Like", "IVE", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.afterschool, "After School", "WEEEKLY", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.chesire, "Cheshire", "ITZY", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.fearless, "Fearless", "Le Sserafim", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.hypeboy, "Hype boy", "NewJeans", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.pinkvenom, "Pink Venom", "BLACKPINK", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.shutdown, "Shutdown", "BLACKPINK", "2022"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.thefeels, "The Feels", "TWICE", "2021"))

        return daftarItem
    }
}