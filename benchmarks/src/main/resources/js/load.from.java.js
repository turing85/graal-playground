var File = Java.addToClasspath('../../../../target/dus.graal.benchmarks-1.0-SNAPSHOT.jar')
var User = Java.type('de.consol.dus.graal.pojo.User');
var me = User.of('Marco', 'm@r.co')
console.log('user(name=' + me.getName() + ", email=" + me.getEmail() + ")")