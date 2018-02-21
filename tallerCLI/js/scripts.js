$(function(){
    cargarTabla();

    $("#btnGuardarUsuario").click(function(){
        const usuario = {
            "nombre": $("#nombre").val(),
            "apellidos": $("#apellidos").val(),
            "direccion": $("#direccion").val(),
            "telefono": $("#telefono").val()
        };

        $.ajax({
            url:"http://localhost:8080/taller/webapi/clientes",
            method: "POST",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(usuario),
        }).done(function(data){
            cargarTabla();
        }).fail(function(a,b,c){
            console.log(c);
        });
    });

    $("#tblBody").on("click", "button.btnVer", function(){
        const id = $(this).data("idUsuario");
        $.getJSON("http://localhost:8080/taller/webapi/clientes/"+id)
            .done(function(usuario){
                $("#nombre").val(usuario.nombre);
                $("#apellidos").val(usuario.apellidos);
                $("#direccion").val(usuario.direccion);
                $("#telefono").val(usuario.telefono);
            });
    });

    $("#tblBody").on("click", "button.btnBorrar", function(){
        const id = $(this).data("idUsuario");
        $.ajax({
            url : "http://localhost:8080/taller/webapi/clientes/"+id,
            method: "DELETE"
        }).done(function(){
            cargarTabla();
        });
    });  
});

let cargarTabla = function(){
    let $tblBody = $("#tblBody");
    $tblBody.empty();
    $.getJSON("http://localhost:8080/taller/webapi/clientes")
        .done(function(usuarios){
            //console.log(usuarios);
            $.each(usuarios, function(i, usuario){
                let $tr = $("<tr/>");

                $tr.append($("<td>",{
                    text: usuario.nombre
                }));

                $tr.append($("<td>",{
                    text: usuario.apellidos
                }));

                $tr.append($("<td>",{
                    text: usuario.direccion
                }));

                $tr.append($("<td>",{
                    text: usuario.telefono
                }));

                $tr.append($("<td>",{
                    html: 
                        "<button class='btnVer' data-id-usuario='"+usuario.id+"'>Ver</button>" +
                        "<button class='btnEditar' data-id-usuario='"+usuario.id+"'>Editar</button>" +
                        "<button class='btnBorrar' data-id-usuario='"+usuario.id+"'>Borrar</button>"
                }));

                $tblBody.append($tr);
            })

        })
        .fail(function(jqxhr, textStatus, error){
            console.log(error);
        });
}