class Solver:
    def __init__(self):
        pass

    @staticmethod
    def get_most_popular_word(sentence):
        """Returns a word which has the highest frequency in sentence,
        order the tied words alphabetically
        """
        words = sentence.split()
        word_dictionary = {}
        sorted_word_list = []
        for word in words:
            if word in word_dictionary:
                word_dictionary[word] += 1
            else:
                word_dictionary[word] = 1
        for word, count in word_dictionary.iteritems():
            sorted_word_list.append((word, count))
        sorted_word_list.sort(key=lambda tup: (-tup[1], tup[0]))
        return sorted_word_list[0][0]
