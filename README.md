Trivial demo for [pitest issue #426](https://github.com/hcoles/pitest/issues/426).

If `TheTest` is in a different package `some_other_package` than the tested `TheImplementation` which is in `some_package`, then pitest doesn't find the tests to kill the mutants.

When I move the test to `some_package`, pitest can do it's work again.
