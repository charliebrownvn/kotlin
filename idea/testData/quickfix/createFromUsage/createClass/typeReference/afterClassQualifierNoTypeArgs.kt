// "Create class 'A'" "true"
// ERROR: Unresolved reference: B
package p

fun foo(): A.B = throw Throwable("")

class A {

}