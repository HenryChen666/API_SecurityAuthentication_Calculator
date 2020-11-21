package SEG3102.calculatorapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calculator")
class ConverterController {
    @GetMapping("/add/{number1}/{number2}")
    fun getAdd(@PathVariable number1: Double, @PathVariable number2: Double) = (number1 + number2)

    @GetMapping("/subtract/{number1}/{number2}")
    fun getSubtract(@PathVariable number1: Double, @PathVariable number2: Double) = (number1 - number2)

    @GetMapping("/multiply/{number1}/{number2}")
    fun getMultiply(@PathVariable number1: Double, @PathVariable number2: Double) = (number1 * number2)

    @GetMapping("/divide/{number1}/{number2}")
    fun getDivide(@PathVariable number1: Double, @PathVariable number2: Double) = (number1 / number2)
}