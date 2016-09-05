from unittest import TestCase
from Solver import Solver


class TestSolver(TestCase):
    def test_get_most_popular_word_1(self):
        sentence = "cat will conquer the world"
        most_popular_word = "cat"
        self.assertEqual(Solver.get_most_popular_word(sentence), most_popular_word)

    def test_get_most_popular_word_2(self):
        sentence = "betty bought a bit of butter but the butter was bitter"
        most_popular_word = "cat"
        self.assertNotEqual(Solver.get_most_popular_word(sentence), most_popular_word)

    def test_get_most_popular_word_3(self):
        sentence = "mirror mirror on the wall the"
        most_popular_word = "mirror"
        self.assertEqual(Solver.get_most_popular_word(sentence), most_popular_word)

