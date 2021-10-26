fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }

fun containsEven1(collection: Collection<Int>): Boolean =
        collection.any { element -> element % 2 == 0 }

