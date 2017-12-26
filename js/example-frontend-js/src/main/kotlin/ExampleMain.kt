/*
 * Copyright 2016-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.js.onClickFunction
import kotlin.browser.document

fun main(args: Array<String>) {
    document.addEventListener("DOMContentLoaded", {
        Application().start()
    })
}

class Application {
    fun start() {
        document.body!!.append.div("content") {
            h1 { +"Kotlin Coroutines JS Example" }
            div {
                button {
                    +"Rect"
                    onClickFunction = { onRect() }
                }
                button {
                    +"Circle"
                    onClickFunction = { onCircle() }
                }
                button {
                    +"Clear"
                    onClickFunction = { onClear() }
                }
            }
            div {
                canvas {
                    id = "canvas"
                    width = "800px"
                    height = "600px"
                }
            }
        }
    }

    fun onRect() {

    }

    fun onCircle() {

    }

    fun onClear() {

    }
}
