fun main(args : Array<String>){
    // Using arrayOf function.....
    val cars = arrayOf("Volvo", "Ford", "BMW", "Mazda")
    println("Volvo" in cars)
    for(car in cars){
      print(car + " ")
    }
    println()
    
    // Primitive specific arrays.....
    var nums = intArrayOf(100, 80, 50, 60, 70, 20)
    println(nums.isEmpty())
    println(nums.contains(100))
    println(nums.size)
    
    nums = nums.sortedArrayDescending(); //Sorting in descending order
    for(num in nums){
      print("$num ")
    }
    
    // By using "Array" constructor....
    var arr = Array(5){i -> i*i}
    println(arr.size)
    for(elem in arr){
      print("$elem ")  // 0 1 4 9 16
    }

    // --------------------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------------    

    // 2D array in kotlin

    // Using Array constructor
    val matrix = Array(3) { IntArray(3) }
    matrix[0][0] = 5  // Set element in the first row and column
    println(matrix[0][0]) // Access and print the element

     // Iterate using forEach loop...
    matrix.forEach { row ->
        row.forEach { col ->
             print("$col ")
        }
        println()
    }
    
    //Direct initialization...
    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    for(i in matrix1.indices){
        for(j in matrix1[i].indices){
            print("${matrix1[i][j]} ")
        }
    }
  }