args = process.argv.slice(2)

array = []
args.forEach(i => array.push(new Number(i)))

console.log(array.sort((a, b) => a - b))