package exercise

class BankAccount(
    var accountName: String,
) {
    private var balance: Double = 0.0
    private var transactions: MutableList<String> = mutableListOf()


    fun deposit(amount: Double) {
        assert(amount >= 0) { "Deposit amount must be non-negative" }
        balance += amount
        saveTransaction(amount)
    }

    fun withdraw(amount: Double) {
        assert(balance >= amount) { "You don't have enough balance." }
        assert(amount >= 0) { "Withdraw amount must be non-negative." }
        balance -= amount
        saveTransaction(amount)
    }

    private fun saveTransaction(amount: Double) {
        transactions.add("Withdraw: $amount to $accountName new ballance: $balance")
    }
}