function createShuffledArray(n) {
  let array = new Array(n)
  for (let index = 0; index < n; ++index) {
    array[index] = index;
  }
  for (let index = n - 1; index >= 0; --index) {
    let min = 0;
    let max = n;
    let swapWith =  Math.floor(Math.random() * (max - min + 1)) + min;
    swap(array, index, swapWith)
  }
  return array
}

function swap(array, i, j) {
  let tmp = array[i]
  array[i] = array[j]
  array[j] = tmp
}

console.log('Preparing random array.')
let shuffled = createShuffledArray(8388608)
console.log('Preparation done, starting test.')

console.time('sort')
shuffled.sort()
console.timeEnd('sort')