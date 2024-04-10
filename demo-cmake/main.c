#include "ffm.h"
#include <locale.h>
#include <stdio.h>
#include <stdlib.h>
#include <wchar.h>

int main(int argc, char *argv[]) {
  Person person = {.Id = 1000000, .Name = "icuxika", .Age = 30};
  dumpPerson(&person);

  printf("%lld\n", sizeof(long long));
  printf("%lld\n", sizeof(int));

  const char *name = getName();
  printf("%s\n", name);

  const char **names = getNames();
  int i = 0;
  while (names[i] != NULL) {
    printf("%s\n", names[i]);
    i++;
  }
  free(names);

  const wchar_t *wName = getWName();
  wprintf(L"%ls\n", wName);

  char *locale = setlocale(LC_ALL, ".UTF8");
  printf("%s\n", locale);

  const wchar_t *cnWName = getCNWName();
  wprintf(L"%ls\n", cnWName);

  return 0;
}