class ListView(val items: Array<String>) {
    inner class ListViewItem() {

        fun displayItem(index: Int) {
            println(items[index])
        }
    }
}

fun main() {
    val listView = ListView(arrayOf("Dawid", "Szoka", "Dawid", "asd", "fds"))
    listView.ListViewItem().displayItem(0)
}