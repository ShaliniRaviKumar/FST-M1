from codecs import xmlcharrefreplace_errors


try:
    print(xmlcharrefreplace_errors)
except NameError:
    print("x hasn't been defined yet.")