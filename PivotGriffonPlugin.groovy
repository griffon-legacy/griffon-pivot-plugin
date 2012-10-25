/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class PivotGriffonPlugin {
    String version = '1.0.0'
    String griffonVersion = '1.1.0 > *'
    Map dependsOn = [:]
    List pluginIncludes = []
    String license = 'Apache Software License 2.0'
    List toolkits = ['pivot']
    List platforms = []
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-pivot-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Enables Pivot support'
    String description = '''
Enables Apache [Pivot][1] as UI toolkit.

Usage
----
TBD

Configuration
-------------
There's no special configuration for this plugin.

[1]: http://pivot.apache.org
'''
}
