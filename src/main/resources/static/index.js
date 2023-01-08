function affiche(){
	
	var user="km";
	console.log(user);
	Swal.fire({
		title:user,
		text:'vous n\'avez pas le droit de depasser le nombre 4000pd "<I>"+voir avec un conseiller datakiss+"</I>" ',
		icon: 'warning',
		position: 'top-end',
	 hideClass: {
    popup: 'animate__animated animate__fadeOutUp'
  }
		
	})
}