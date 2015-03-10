package com.asciidoc.extension.raml;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.extension.spi.ExtensionRegistry;

public class RamlExtensionRegistry implements ExtensionRegistry {
  @Override
  public void register(Asciidoctor asciidoctor) {
    asciidoctor.javaExtensionRegistry().blockMacro("raml", RamlBlockMacro.class);
  }
}