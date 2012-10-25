package griffon.pivot.editors

import spock.lang.Specification
import spock.lang.Unroll

import org.apache.pivot.wtk.Dimensions
import java.beans.PropertyEditor

@Unroll
class DimensionsPropertyEditorSpec extends Specification {
    void "Dimensions format '#format' should be equal to #dimensions"() {
        setup:

        PropertyEditor editor = new DimensionsPropertyEditor()

        when:
        editor.value = format

        then:

        dimensions == editor.value

        where:
        dimensions             | format
        new Dimensions(10, 20) | '10,20'
        new Dimensions(10, 20) | '10, 20'
        new Dimensions(10, 20) | ' 10, 20'
        new Dimensions(10, 20) | ' 10, 20 '
        new Dimensions(10, 20) | [10, 20]
        new Dimensions(10, 20) | ['10', '20']
        new Dimensions(10, 10) | 10
        new Dimensions(10, 10) | '10'
        new Dimensions(10, 10) | [10]
        new Dimensions(10, 10) | ['10']
        new Dimensions(10, 20) | [width: 10, height: 20]
        new Dimensions(10, 20) | [width: '10', height: '20']
        new Dimensions(10, 20) | [w: 10, h: 20]
        new Dimensions(10, 20) | [w: '10', h: '20']
        new Dimensions(0, 0)   | [:]
        new Dimensions(0, 0)   | [foo: 10, bar: 20]
    }

    void "Invalid dimensions format '#format'"() {
        setup:

        PropertyEditor editor = new DimensionsPropertyEditor()

        when:
        editor.value = format

        then:

        thrown(IllegalArgumentException)

        where:
        format << [
                '',
                '   ',
                'garbage',
                '1, 2, 3',
                [],
                [1, 2, 3],
                [width: 'a'],
                [w: 'b'],
                new Object()
        ]
    }
}
