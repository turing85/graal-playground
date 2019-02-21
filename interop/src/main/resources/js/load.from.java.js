var File = Java.addToClasspath('../../../../target/dus.graal.interop-1.0-SNAPSHOT.jar')
var User = Java.type('de.consol.dus.graal.pojo.User');
var me = User.of('Jane Doe', 'jane@doe.com')
console.log(me)