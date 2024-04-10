#ifndef FFM_H
#define FFM_H

#include <wchar.h>

#ifdef _WIN32
#define LIB_DLL_EXPORT __declspec(dllexport)
#else
#define LIB_DLL_EXPORT
#endif

typedef struct Person {
  long long Id;
  char Name[10];
  int Age;
} Person;

typedef void (*OnEach)(int element);

LIB_DLL_EXPORT void forEach(int array[], int length, OnEach onEach);
LIB_DLL_EXPORT void dumpPerson(Person *person);
LIB_DLL_EXPORT const char *getName();
LIB_DLL_EXPORT const char **getNames();
LIB_DLL_EXPORT const wchar_t *getWName();
LIB_DLL_EXPORT const wchar_t *getCNWName();

#endif
