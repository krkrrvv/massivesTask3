fun main() {
    var key: String
    var text: String
    while(true) {
        print("Введите ключевое слово: ")
        key = readln().lowercase()
        if (key.isEmpty() || !key.all { it in 'а'..'я' || it == 'ё' }) {
            println("Ошибка!")
            continue
        }
        else break
    }
    while(true) {
        print("Введите исходный текст: ")
        text = readln().lowercase()
        if (text.isEmpty() || !text.all { it in 'а'..'я' || it == 'ё' }) {
            println("Ошибка!")
            continue
        }
        else break
    }
    val lets = charArrayOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и',
        'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
        'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
    val nums = intArrayOf(21, 13, 4, 20, 22, 1, 25, 12, 24, 14, 2, 28, 9,
        23, 3, 29, 6, 16, 15, 11, 26, 5, 30, 27, 8, 18, 10, 33, 31, 32, 19, 7, 17)
    var res = ""
    for (i in 0..text.length - 1) {
        var textNum = 0
        var keyNum = 0
        for (j in 0..lets.size - 1) {
            if (lets[j] == text[i]) {
                textNum = nums[j]
            }
            if (lets[j] == key[i % key.length]) {
                keyNum = nums[j]
            }
        }
        var newNumber = textNum + keyNum
        if (newNumber > 33) {
            newNumber -= 33
        }
        for (j in 0..nums.size - 1) {
            if (nums[j] == newNumber) {
                res += lets[j]
            }
        }
    }
    println("${res.uppercase()}")
}