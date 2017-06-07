import spock.lang.Specification

class HelloWorldSpec extends Specification {
    def "should do something"() {
        when:
        final String s = 'foo'

        then:
        s == 'foo'
    }
}
