package griffon.pivot.editors

import spock.lang.Specification
import spock.lang.Unroll

import org.apache.pivot.wtk.Bounds

import java.beans.PropertyEditor

@Unroll
class BoundsPropertyEditorSpec extends Specification {
    void "Bounds format '#format' should be equal to #bounds"() {
        setup:

        PropertyEditor editor = new BoundsPropertyEditor()

        when:
        editor.value = format

        then:

        bounds == editor.value

        where:
        bounds                     | format
        new Bounds(10, 20, 30, 40) | '10,20,30,40'
        new Bounds(10, 20, 30, 40) | '10, 20, 30, 40'
        new Bounds(10, 20, 30, 40) | ' 10, 20, 30, 40'
        new Bounds(10, 20, 30, 40) | ' 10, 20, 30, 40 '
        new Bounds(10, 20, 30, 40) | [10, 20, 30, 40]
        new Bounds(10, 20, 30, 40) | ['10', '20', '30', '40']
        new Bounds(10, 20, 30, 40) | [x: 10, y: 20, width: 30, height: 40]
        new Bounds(10, 20, 30, 40) | [x: '10', y: '20', width: '30', height: '40']
        new Bounds(10, 20, 30, 40) | [x: 10, y: 20, w: 30, h: 40]
        new Bounds(10, 20, 30, 40) | [x: '10', y: '20', w: '30', h: '40']
        new Bounds(0, 0, 0, 0)     | [:]
        new Bounds(0, 0, 0, 0)     | [foo: 10, bar: 20]
    }

    void "Invalid bounds format '#format'"() {
        setup:

        PropertyEditor editor = new BoundsPropertyEditor()

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
            '1, 2, 3, 4, 5',
            [],
            [1, 2, 3],
            [1, 2, 3, 4, 5],
            [x: 'a'],
            [y: 'b'],
            new Object()
        ]
    }
}
